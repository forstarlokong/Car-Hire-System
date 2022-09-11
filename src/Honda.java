class Honda extends Car{
    void highpower(){System.out.println("This Honda Brand is High Power.");}
    void longdistance(){System.out.println("This Honda Brand is for Long distances.");}

    class TestInheritance{
        public static void main(String args[]){
            Honda c1 = new Honda();
            c1.highpower();
            c1.longdistance();
        }}}