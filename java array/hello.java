class hello{
    public static void main(String[] args){
        int []a ={1,3,4,5,6};
        System.out.print("1d-array normally :");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int b[] = new int[4];
        b[0]=38;
        b[1]=45;
        b[2]=76;
        b[3]=88;
        System.out.print("1d-array using object method: ");
        for(int i=0;i<4;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        //int n[][] = new int [2][2];
        //n[0][0]=34;
        //n[0][1]=56;
        //n[1][0]=65;
        //n[1][1]=89;

        int n[][] ={
            {5,2,3,4},
            {3,5,7},
            {2,1}
        };

        for (int j=0;j<3;j++){
            for(int i=0;i<n[j].length;i++){
                System.out.print(" "+n[j][i]+" ");
            }
            System.out.println();
        }
        System.out.print("2-d array :");
        for(int i[] : n){
            for(int j : i){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println(n[2].length);
    System.out.println("length of 1d array : "+ b.length);

    int[] arr =new int[0];

    System.out. println(arr.length);

    String name= "ananyo";
    System.out.println(name.length());
}
}