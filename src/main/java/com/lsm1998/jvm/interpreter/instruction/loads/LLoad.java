package com.lsm1998.jvm.interpreter.instruction.loads;

import com.lsm1998.jvm.interpreter.base.Index8Instruction;
import com.lsm1998.jvm.rtda.pri.stack.Frame;

/**
 * @作者：刘时明
 * @时间：2019/3/22-21:24
 * @说明：
 */
public class LLoad extends Index8Instruction
{
    @Override
    public void execute(Frame frame)
    {
        long temp=frame.getLocalVars().getLong(index);
        frame.getOperandsStack().pushLong(temp);
    }

    @Override
    public String toString()
    {
        return "lload";
    }
}
