package h9;

import e9.s0;
import java.util.List;

public interface i {
    s0 createDispatcher(List<? extends i> list);

    int getLoadPriority();

    String hintOnError();
}
