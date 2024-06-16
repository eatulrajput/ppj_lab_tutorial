class Box 
	{
    		double length;
    		double width;
    		double height;

    		double getVolume() 
		{
        		return length * width * height;			}
	  	}

 class BoxDemo 
	{
    		public static void main(String[] args) 
		{

        		System.out.println();
        		System.out.println("Student Name: Atul Rajput");
        		System.out.println("Roll No.: 2230158");
        		System.out.println();

        		// 1. Create two objects of class Box
        		Box box1 = new Box();
        		Box box2 = new Box();

       			 // 2. Assign values to two objects using objects’ instance-variables
        		box1.length = 5.0;   // in meters
        		box1.width = 3.0;    // in meters
        		box1.height = 2.0;   // in meters

        		box2.length = 7.0;   // in meters
        		box2.width = 4.0;    // in meters
        		box2.height = 3.0;   // in meters

        		// Get the volumes of two boxes using instance-variables
        		double volume1 = box1.getVolume();
        		double volume2 = box2.getVolume();

        		System.out.println("Volume of Box 1: " + volume1 + " cubic meters");
        		System.out.println("Volume of Box 2: " + volume2 + " cubic meters");

        		// 3. Set values to two objects using parameterized methods
        		setBoxValues(box1, 10.0, 6.0, 4.0);
        		setBoxValues(box2, 8.0, 5.0, 3.0);

        		// Get the volumes of two boxes using parameterized methods
        		double newVolume1 = box1.getVolume();
        		double newVolume2 = box2.getVolume();

        		System.out.println("New Volume of Box 1: " + newVolume1 + " cubic meters");
        		System.out.println("New Volume of Box 2: " + newVolume2 + " cubic meters");
    		}

    			// Parameterized method to set values for a Box object
    			private static void setBoxValues(Box box, double length, double width, double height) 
		{
        		box.length = length;   // in meters
        		box.width = width;     // in meters
        		box.height = height;   // in meters
    		}
	}
