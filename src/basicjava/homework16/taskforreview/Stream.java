package basicjava.homework16.taskforreview;

import java.util.Arrays;

public class Stream {
    private String streamname ;
private Group1[] groups ;


    public Stream(String streamname,  Group1[] groups) {
        this.streamname = streamname;

        this.groups = groups;
    }

    public String getStreamname() {
        return streamname;
    }



    public Group1[] getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamname='" + streamname + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
