package algorithms.strings;

public class DynamicallyFormString {


    public static void main(String[] args) {

        int lightX = 0; // the X position of the light of power
        int lightY = 17; // the Y position of the light of power
        int initialTx = 17; // Thor's starting X position
        int initialTy = 18; // Thor's starting Y position
        System.out.println("thor: ("+initialTx+","+initialTy+")");
        System.out.println("light: ("+lightX+","+lightY+")");
        StringBuilder direction = new StringBuilder();

        if(initialTy>lightY){//->N
            direction.append("N");
            if(initialTx>lightX){
                direction.append("W");
            }else if(initialTx<lightX){
                direction.append("E");
            }
        }else if(initialTy<lightY){//->S
            direction.append("S");
            if(initialTx>lightX){
                direction.append("W");
            }else if(initialTx<lightX){
                direction.append("E");
            }
        }else {
            if(initialTx>lightX){
                direction.append("W");
            }else if(initialTx<lightX){
                direction.append("E");
            }
        }


        // A single line providing the move to be made: N NE E SE S SW W or NW
        System.out.println(direction);
    }
}
