package ch4_initialization_and_cleanup;
/****************** Exercise 11 ****************
 * Modify Exercise 10 so your
 * finalize() will always be called.
 ***********************************************/
public class E11_FinalizeAlwaysCalled {
    protected void finalize() {
        System.out.println("finalize() called");
    }
    public static void main(String args[]) {
        new E11_FinalizeAlwaysCalled();
        System.gc();
        System.runFinalization();
    }
}
//Calling System.gc( ) and System.runFinalization( ) in sequence will
//probably but not necessarily call your finalizer (The behavior of finalize has been
//uncertain from one version of JDK to another.) The call to these methods is just
//a request; it doesn’t ensure the finalizer will actually run. Ultimately, nothing
//guarantees that finalize( ) will be called.