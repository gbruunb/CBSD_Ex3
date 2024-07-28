package observer;

import java.util.ArrayList;

/**
 *
 * @author 65050521
 */
public abstract class MatchSource {
    private final ArrayList<Register> registrants = new ArrayList<>();

    public final void registerGuest(Register guest) {
        registrants.add(guest);
    }

    public final void unregisterGuest(Register guest) {
        registrants.remove(guest);
    }

    protected final void notifier() {
        for (int i = 0; i < registrants.size(); i++) {
            registrants.get(i).scoreUpdate(this);
        }
    }
}