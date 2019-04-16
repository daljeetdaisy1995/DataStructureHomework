package dataStructureHomework;

public class Arrays {
    public static void main(String[] args) {

        int i []= new int [4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i.length);//size of array
        System.out.println(i[2]);
        System.out.println("==============");
        //print all values of array
        for(int p = 0; p<i.length; p++){
            System.out.println("The value of the index is:"+i[p]+ " "+p);
        }
        System.out.println("==============");

        int j [] = {100,200,300,400};
        System.out.println(j.length);
        System.out.println(j[3]);
        System.out.println("==============");

        String table [] = new String [2];
        table [0] = "Jeff";
        table [1] = "Daljeet";
        System.out.println(table.length);
        System.out.println(table[1]);
        System.out.println("==============");
        try{
        System.out.println(table[2]);}
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception");
        }
        System.out.println("==============");

        for(int m =0; m<table.length;m++){
            System.out.println(table[m]);


        }
        System.out.println("==============");

        Object obj [] = new Object [3]; //all data types
        obj [0] = "Tom";
        obj [1] = 100;
        obj [2] = 12.33;
        System.out.println(obj.length);

        for(int n =0; n<obj.length;n++){
            System.out.println(obj[n]);

        }





    }
}

