// We have to calculate the average of marks obtained in three subjects by
//student A and by student B. Create class 'Marks' with an abstract method
//'getPercentage' that will return the average percentage of marks. Provide
//implementation of abstract methods in classes 'A' and 'B'. The constructor of
//student A takes the marks in three subjects as its parameters and the marks
//in four subjects as its parameters for student B. Test your code?

public class MockClass12 {

    float getPercentage() {
        return 0;
    }
}
class A extends MockClass12{
    int mark1;
    int mark2;
    int mark3;
    A(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark3;
        this.mark3=mark2;
    }

    @Override
    float getPercentage() {
        return (float) ((mark1 + mark2 + mark3) /3);
    }
}
class B extends MockClass12{
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    B(int mark1,int mark2,int mark3,int mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }
    @Override
    float getPercentage() {
        return (float) ((mark1+mark2+mark3+mark4)/4);
    }
}
class MarksTester{
    public static void main(String[] args) {
        MockClass12[] marksAverage={new A(65,78,41),new B(87,26,48,95)};
        for (MockClass12 MockClass12 : marksAverage) {
            System.out.println("The average percentage of marks is "+MockClass12.getPercentage());
        }
    }

}



