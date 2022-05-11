package com.vmlens.trace.agent.bootstrap.parallelize.loop;

/*
  end
  afterOperation (auch in handler)

 */

import com.vmlens.trace.agent.bootstrap.parallelize.command.Command;

public class AllInterleavingsRun {

    private final Object MONITOR = new Object();
    private final int runId;
    private final RunStateMachine runState = new RunStateMachine();

    public AllInterleavingsRun(int runId) {
        this.runId = runId;
    }

    boolean advance() {
        synchronized (MONITOR) {
            return runState.advance();
        }
    }

    void close() {
        synchronized (MONITOR) {
            runState.close();
        }
    }

    /*
    				interleaveControlLogic.afterOperation(threadId, operation, System.currentTimeMillis());
				notifyMonitor();
				waitTillActive(threadId);

				 @Override
    protected void waitTillActive(long threadId) throws InterruptedException {

        long startedWaiting = System.currentTimeMillis();

        while (interleaveControlLogic.needs2Wait(threadId, System.currentTimeMillis())) {
            ParallizeSingelton.SINGLE_LOCK.wait(10);
            if (System.currentTimeMillis() > startedWaiting + InterleaveControlLogic.TIMEOUT + 2000) {
                AgentLogCallback.logTimeout(interleaveControlLogic.threadId2State, interleaveControlLogic.logicState);
                return;
            }
        }
    }

     */

    void after(Command command, long threadId) {

    }

}
