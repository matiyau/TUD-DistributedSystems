package taskmanager

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import executionplan.Task

trait TaskManagerInterface extends Remote {
    @throws(classOf[MalformedURLException])
    @throws(classOf[NotBoundException])
    @throws(classOf[RemoteException])
    def assignTask[A, B](task: Task[A, B]): Unit // TODO: add Task argument 
}
