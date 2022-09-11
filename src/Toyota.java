class Toyota extends Car{
    void v8engine(){System.out.println("This Toyota Brand is V8 Engine.");}
    void longdistance(){System.out.println("This Toyota Brand is for Long distances.");}

    class TestInheritance{
        public static void main(String args[]){
            Toyota c1 = new Toyota();
            c1.v8engine();
            c1.longdistance();
        }}}