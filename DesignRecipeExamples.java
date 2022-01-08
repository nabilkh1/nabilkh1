import tester.*;

class DesignRecipeExamples {
    //this method(perimiter), takes integers of width and height and calculates the perimiter of that rectangle 
    int perimeter (int width, int height){
        /* because rectangles haveht on two same width and heigt on two sides, 
        to get perimiter, we need to add up 2* by the legnth of the width, which is equal to width+width, and the same 
        process with height in order to get the perimiter(width+width+height+height*/
        return (2*width)+(2*height);
    }
    int Example1= this.perimeter(10, 15); //should be 50
    int Example2= this.perimeter(5,10); //should be 30
   
/* this method takes two rectnagles finds both its areas and takes the area of the outside rectangle not including 
the area of the inside recgtangle if both rectangles exact centers were at (0,0 ) on a graph*/
    int borderArea(int width1, int height1, int width2, int height2){
        return (width1*height1)-(width2*height2);
        /* this equation allows for us to take the area of the larger rectangle and subtract the area of the smaller 
        rectangle. This assumes that width1 and height1's area is greater than width2 and height2
        We could use a boolean to return the program if the area1 is greater than area2 and then use an else statement 
if that assumetion is not true to subtract area2 by area1, which would allow us to input any numbers and return this statement;
however, this is not what the prompt asks for, and a larger area for width2*height2 is an example that does not work for this */
    }
    int test1= borderArea(50, 10, 25, 5); //should be 375
    int test2=borderArea(25, 5, 15, 3); //should be 80
/*This method takes an interger value of tmeperature in Fahrenheit and converts it to an integer value of temperature in celsius*/
//this function only has one parameter(the degrees in Fahrenheit) becuase the tests or method inputs one fahrenheir temp in and gives us one output in celsius
//therefore, we would not have another parameter, becuase there is one input and one output. 
    int FahrenheitToCelsius(int F){
        //becuase the method is an int, we have to multiple by 5 then divide by 9 sequenctially as if 5/9 occurs it will convert to 0 becuase its not a double
        return (((F-32)*5)/9);
        //An example that is a limitation is decimals because if there is a decimal value it is rounded down with the int 
//This can be fixed by using a double, but the instructions call for the method and parameters to be integers
    }
    int method1= FahrenheitToCelsius(90);//should be 32 degrees Celsius
    int method2= FahrenheitToCelsius(0);//should be -17 degrees Celsius
    

    int HoursPlusMinutes(int hours, int minutes){
        return ((hours*60)+minutes);
    }
    int check1= HoursPlusMinutes(4, 8); //should be 248 minutes
    int check2= HoursPlusMinutes( 15, 300); //should be 1200 minutes


}