package cowin.slot.model;

import java.util.List;

public class SessionsByPin {
   private final List<Sessions> sessions;

   public SessionsByPin(List<Sessions> sessions) {
      this.sessions = sessions;
   }

   public List<Sessions> getSessions() {
      return sessions;
   }
}
