package mop;

import mop.LoggerSpecification.SpecificationType;

public class Socket_ReuseSocket {

    public void eventSocket_ReuseSocket(String[] history) {

        String[] interesting = new String[] {"bind", "connect"};
        if (filter(history, interesting)) {
            LoggerSpecification.printLogging(SpecificationType.Socket_ReuseSocket);
        }

    }

    private boolean filter(String[] history, String[] interesting) {
        boolean foundClose = false;
        for (int i = 0; i < history.length; i++) {
            if ("close".equals(history[i])) {
                foundClose = true;
                // Verifica se há algum método interessante após o "close"
                for (int j = i + 1; j < history.length; j++) {
                    for (String interestingMethod : interesting) {
                        if (interestingMethod.equals(history[j])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
