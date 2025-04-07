class PenDis {
    public static void main(String[] args){
       int tpens = 14;
       int tstudent = 3;
       int esp = tpens/tstudent;
       int rpens = tpens%tstudent;
       System.out.println("The Pen Per Student is"+ esp + "and the remaining pen not distributed is" + rpens);
    }
} 