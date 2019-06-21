package ch4_initialization_and_cleanup;

public class E10_FinalizeCall {
    protected void finalize() {
        System.out.println("finalize() called");
    }
    public static void main(String args[]) {
        new E10_FinalizeCall();
    }
}
//You probably won’t see the finalizer called because the program doesn’t usually
//generate enough garbage for the collector to run.
