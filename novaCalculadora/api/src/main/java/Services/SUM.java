package Services;

import Extensions.*;
import Interfaces.ICalculate;

public class SUM extends CalculateDefault implements ICalculate 
{
    @Override
    public double Calculate() {
        return firstNumber + secoundNumber;
    }
}
