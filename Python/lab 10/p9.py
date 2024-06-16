print("Name: Atul Rajput")
print("Roll No. 2230158")
print()

class Task:
    def __init__(self, description, priority):
        self.description = description
        self.priority = priority
    
    def __str__(self):
        return f"Task: {self.description} (Priority: {self.priority})"

class TodoList:
    def __init__(self):
        self.tasks = []
    
    def add_task(self, description, priority):
        task = Task(description, priority)
        self.tasks.append(task)
        print(f"Task '{description}' added successfully.")
    
    def remove_task(self, index):
        if 0 <= index < len(self.tasks):
            removed_task = self.tasks.pop(index)
            print(f"Task '{removed_task.description}' removed successfully.")
        else:
            print("Invalid task index.")
    
    def display_tasks(self):
        if self.tasks:
            print("Tasks in Todo List:")
            for i, task in enumerate(self.tasks):
                print(f"{i+1}. {task}")
        else:
            print("Todo List is empty.")


todo_list = TodoList()

todo_list.add_task("Complete project", "High")
todo_list.add_task("Buy groceries", "Medium")
todo_list.add_task("Talk to friend", "Low")

todo_list.display_tasks()

todo_list.remove_task(1)

todo_list.display_tasks()
