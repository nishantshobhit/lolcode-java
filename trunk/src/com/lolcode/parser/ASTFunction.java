/* Generated By:JJTree: Do not edit this line. ASTFunction.java */

package com.lolcode.parser;

public class ASTFunction extends SimpleNode {
    public ASTFunction(int id) {
        super(id);
    }

    public ASTFunction(LolCode p, int id) {
        super(p, id);
    }

    // this could be optimized away.  I'm not sure how you specify this in jjTree though
    public void interpret(com.lolcode.Runtime runtime) {
        jjtGetChild(0).interpret(runtime);
    }
}
