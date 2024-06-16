print("Name: Atul Rajput")
print("Roll No. 2230158")
print()
class Movie:
def __init__(self, title, actor, actress):
self.title = title

self.actor = actor
self.actress = actress
def display_info(self):
print(f"Title: {self.title}")
print(f"Actor: {self.actor}")
print(f"Actress: {self.actress}")

def prompt_for_movie():
title = input("Enter the title of the movie: ")
actor = input("Enter the actor's name: ")
actress = input("Enter the actress's name: ")
return Movie(title, actor, actress)
movies_list = []
while True:

choice = input("Do you want to add a movie? (Yes/No):
").strip().lower()

if choice == 'yes':
movies_list.append(prompt_for_movie())
elif choice == 'no':
break
else:

print("Invalid choice. Please enter Yes or No.")

print("\nMovies Information:")
for movie in movies_list:
movie.display_info()
print()