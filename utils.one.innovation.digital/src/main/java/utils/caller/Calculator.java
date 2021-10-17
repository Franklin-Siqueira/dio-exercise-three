package utils.caller;

import utils.interfaces.operations.DivOperation;
import utils.interfaces.operations.MltOperation;
import utils.interfaces.operations.SubOperation;
import utils.interfaces.operations.SumOperation;

public class Calculator {
    private DivOperation divOperation;
    private MltOperation mltOperation;
    private SubOperation subOperation;
    private SumOperation sumOperation;

    public Calculator(){
        divOperation = new DivOperation();
        mltOperation = new MltOperation();
        subOperation = new SubOperation();
        sumOperation = new SumOperation();
    }

    public int sum(int a, int b){
        return sumOperation.execute(a,b);
    }

    public  int sub(int a, int b){
        return  subOperation.execute(a, b);
    }

    public  int mult(int a, int b){
        return  mltOperation.execute(a, b);
    }

    public  int div(int a, int b){
        return  divOperation.execute(a, b);
    }
}
