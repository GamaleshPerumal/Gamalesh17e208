package classandoobj;
import java.io.*;
public class box {
	 int width;
	 int height;
	 int depth;
	
	 public box(int width,int height,int depth)
	 {
		 this.width=width;
		 this.height=height;
		 this.depth=depth;
	}
	 public int getWidth()
	 {
		 return width;
	 }
	 public int getHeight()
	 {
		 return height;
	 }
	 public int getDepth()
	 {
		 return depth;
	 }
	 public int Volume()
	 {
		 return ((int)width*height*depth);
	 }
	 public static void main(String[] args) {
		box b=new box(10,20,30);
		System.out.println(b.Volume());
	}
	

}

