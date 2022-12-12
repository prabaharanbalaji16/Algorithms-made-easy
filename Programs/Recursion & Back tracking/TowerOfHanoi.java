public class TowerOfHanoi{
    public static void tower(int n, char fromRod, char toRod, char auxRod)
    {
        if(n==1)
        {
            System.out.println("Disk 1 is moved from "+fromRod+" to "+toRod);
            return;
        }

        tower(n-1,fromRod,auxRod,toRod);

        System.out.println("Disk "+n+" is moved from "+fromRod+" to "+toRod);

        tower(n-1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        tower(3,'A','B','C');
    }
}



