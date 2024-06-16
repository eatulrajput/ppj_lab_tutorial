print("Name: Atul Rajput")
print("Roll No. : 2230158")
print()

class MediaPlayer:
    def play(self):
        pass

class AudioPlayer(MediaPlayer):
    def __init__(self, audio_file):
        self.audio_file = audio_file
    
    def play(self):
        print(f"Playing audio file: {self.audio_file}")

class VideoPlayer(MediaPlayer):
    def __init__(self, video_file):
        self.video_file = video_file
    
    def play(self):
        print(f"Playing video file: {self.video_file}")

audio_player = AudioPlayer("song.mp3")
audio_player.play() 

video_player = VideoPlayer("movie.mp4")
video_player.play()
