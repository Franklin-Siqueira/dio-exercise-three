package utils.interfaces.operations;

import utils.interfaces.Operation;

public class MltOperation implements Operation {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}