public class MoveBox {
    public static void main(String[] args){

        int box = 32;
        int truck = 9;

        while (box >= truck ){
            System.out.println("Un voyage de 9 cartons");
            box -= truck;
        }
        System.out.println("Un voyage de "+box+" cartons");
    }
}
