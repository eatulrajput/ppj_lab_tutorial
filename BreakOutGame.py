import pygame
import sys
import random
from pygame.locals import *

# Constants
WIDTH = 1000
HEIGHT = 600
PADDLE_WIDTH = 100
PADDLE_HEIGHT = 10
BALL_RADIUS = 10
BRICK_WIDTH = 60
BRICK_HEIGHT = 20
BRICK_ROWS = 5
BRICK_COLS = 20
WHITE = (255, 255, 255)
BLACK = (48, 0, 74)
FPS = 60

# Initialize Pygame
pygame.init()

# Set up the window
window = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Breakout Game")


# Clock for controlling the frame rate
clock = pygame.time.Clock()

# Fonts
font = pygame.font.Font(None, 36)

# Function to draw the paddle
def draw_paddle(paddle_x):
pygame.draw.rect(window, WHITE, (paddle_x, HEIGHT -
PADDLE_HEIGHT, PADDLE_WIDTH, PADDLE_HEIGHT))

# Function to draw the ball
def draw_ball(ball_x, ball_y):
pygame.draw.circle(window, WHITE, (ball_x, ball_y),
BALL_RADIUS)

# Function to draw the bricks
def draw_bricks(bricks):
border_size = 1 # Size of the border around each brick
inner_color = (184, 51, 255) # Color for the inner part
of the brick
border_color = WHITE # Color for the border

for brick in bricks:
pygame.draw.rect(window, border_color, brick)
inner_brick = (brick.x + border_size, brick.y +

border_size,

brick.width - 2 * border_size,

brick.height - 2 * border_size)

pygame.draw.rect(window, inner_color, inner_brick)

# Function to check collision with the paddle

def check_paddle_collision(ball_x, ball_y, paddle_x):
if ball_y + BALL_RADIUS >= HEIGHT - PADDLE_HEIGHT and
paddle_x <= ball_x <= paddle_x + PADDLE_WIDTH:

return True
return False

# Function to check collision with the bricks
def check_brick_collision(ball_x, ball_y, bricks):
for brick in bricks:
if brick.colliderect(pygame.Rect(ball_x -
BALL_RADIUS, ball_y - BALL_RADIUS, BALL_RADIUS * 2,
BALL_RADIUS * 2)):

bricks.remove(brick)
return True

return False

# Function to initialize the bricks
def init_bricks():
bricks = []
for row in range(BRICK_ROWS):
for col in range(BRICK_COLS):
brick = pygame.Rect(col * (BRICK_WIDTH + 5), 30
+ row * (BRICK_HEIGHT + 5), BRICK_WIDTH, BRICK_HEIGHT)

bricks.append(brick)

return bricks

# Function to display score and time
def display_info(score, time):
score_text = font.render("Score: " + str(score), True,
WHITE)
time_text = font.render("Time: " + str(time), True,
WHITE)
window.blit(score_text, (10, 10))

window.blit(time_text, (WIDTH - 150, 10))

# Function to display game over screen
def game_over_screen(score, time):
window.fill((48, 0, 74))
game_over_text = font.render("Game Over", True, WHITE)
final_score_text = font.render("Score: " + str(score),
True, WHITE)
final_time_text = font.render("Time: " + str(time),
True, WHITE)
restart_text = font.render("Restart", True, (48, 0, 74))
quit_text = font.render("Quit", True, (48, 0, 74))
window.blit(game_over_text, (WIDTH // 2 - 100, HEIGHT //
2 - 50))
window.blit(final_score_text, (WIDTH // 2 - 100, HEIGHT
// 2))
window.blit(final_time_text, (WIDTH // 2 - 100, HEIGHT
// 2 + 50))
pygame.draw.rect(window, WHITE, (WIDTH // 2 - 50, HEIGHT
// 2 + 100, 100, 50))
pygame.draw.rect(window, WHITE, (WIDTH // 2 - 50, HEIGHT
// 2 + 160, 100, 50))
window.blit(restart_text, (WIDTH // 2 - 40, HEIGHT // 2
+ 110))
window.blit(quit_text, (WIDTH // 2 - 30, HEIGHT // 2 +
170))
pygame.display.update()

while True:
for event in pygame.event.get():
if event.type == QUIT:
pygame.quit()
sys.exit()

elif event.type == MOUSEBUTTONDOWN:
mouse_x, mouse_y = pygame.mouse.get_pos()
if WIDTH // 2 - 50 <= mouse_x <= WIDTH // 2
+ 50 and HEIGHT // 2 + 100 <= mouse_y <= HEIGHT // 2 + 150:

main()
elif WIDTH // 2 - 50 <= mouse_x <= WIDTH //
2 + 50 and HEIGHT // 2 + 160 <= mouse_y <= HEIGHT // 2 +
210:

pygame.quit()
sys.exit()

# Main function
def main():
# Initialize game variables
paddle_x = (WIDTH - PADDLE_WIDTH) // 2
ball_x = random.randint(BALL_RADIUS, WIDTH -
BALL_RADIUS)
ball_y = HEIGHT // 2
ball_dx = random.choice([-5, 5])
ball_dy = -5
bricks = init_bricks()
score = 0
start_time = pygame.time.get_ticks() // 1000
game_over = False

# Game loop
while True:
window.fill((48, 0, 74))

# Event handling
for event in pygame.event.get():
if event.type == QUIT:
pygame.quit()


sys.exit()

# Move the paddle
keys = pygame.key.get_pressed()
if keys[K_LEFT] and paddle_x > 0:
paddle_x -= 5
if keys[K_RIGHT] and paddle_x < WIDTH -

PADDLE_WIDTH:

paddle_x += 5

# Move the ball
ball_x += ball_dx
ball_y += ball_dy

# Check collision with walls
if ball_x - BALL_RADIUS <= 0 or ball_x + BALL_RADIUS

>= WIDTH:

ball_dx *= -1
if ball_y - BALL_RADIUS <= 0:
ball_dy *= -1

# Check collision with paddle
if check_paddle_collision(ball_x, ball_y, paddle_x):
ball_dy *= -1

# Check collision with bricks
if check_brick_collision(ball_x, ball_y, bricks):
score += 5
ball_dy *= -1

# Check if the ball missed the paddle
if ball_y + BALL_RADIUS >= HEIGHT:
game_over = True


# Draw elements
draw_paddle(paddle_x)
draw_ball(ball_x, ball_y)
draw_bricks(bricks)
display_info(score, pygame.time.get_ticks() // 1000

- start_time)

# Update the display
pygame.display.update()
clock.tick(FPS)

# Game over condition
if game_over:
final_score = score
final_time = pygame.time.get_ticks() // 1000 -

start_time

game_over_screen(final_score, final_time)

if __name__ == "__main__":
main()