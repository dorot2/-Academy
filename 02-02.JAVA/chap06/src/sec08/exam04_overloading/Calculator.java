package sec08.exam04_overloading;

public class Calculator {

	// 정사각형의 넓이
	double areaRectange(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectange(double width, double height) {
		return width * height;
	}
}
