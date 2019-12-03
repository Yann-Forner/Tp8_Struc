import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(SquareSum(3));
        System.out.println(SquareSum2(3));
    }

    public static int SquareSumAux(int x, int y){
        while (x!=1){
            y = x*x+y;
            --x;
        }
        return y;
    }

    public static int SquareSum(int n){
        Stack<Action> stack = new Stack();
        stack.push(new Action(true,n));
        int resultat=0;
        while (!stack.empty()){
            Action action = stack.peek();
            stack.pop();
            if(action.getEtat()){
                if (action.getVal() != 1){
                    stack.push(new Action(false,action.getVal()));
                    stack.push(new Action(true,action.getVal()-1));
                }else{
                    resultat += 1;
                }
            }else{
                resultat+=action.getVal()*action.getVal();
            }
        }
        return resultat;
    }

    public static int SquareSum2(int n){
        int result=0;
        for (int i = 1; i <=n ; i++) {
            result+= i*i;
        }
        return result;
    }
}
