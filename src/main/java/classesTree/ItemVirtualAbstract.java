package classesTree;

import java.util.ArrayList;
import java.util.UUID;

public class ItemVirtualAbstract implements iItem {
    private UUID Guid=null;
    public String Name=null;
    public ArrayList<String> attributes=new ArrayList<>();
    public int attributesCount=0;
    public ArrayList<Object> children = new ArrayList<>();
    public int childCount=0;
    public Object parent=null;
    public String uriPath=null;

    public void setGuid(UUID _guid){
        this.Guid=_guid;
    }
    public UUID getGuid(){
        return Guid;
    }
}
