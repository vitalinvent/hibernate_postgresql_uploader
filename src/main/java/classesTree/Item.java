package classesTree;

import java.util.ArrayList;
import java.util.UUID;

public class Item implements iItem {
    UUID Guid=null;
    String Name=null;
    ArrayList<String> Attributes=new ArrayList<>();
    ArrayList<Item> Children = new ArrayList<>();
    Object Parent=null;
    String uriPath=null;
    String Type=null;
    String IsLink = null;
    String Link = null;
    Boolean IsSearch = null;

    public Item(){}

    public Item(String guid){
        Guid=UUID.fromString(guid);
    }
    public Item(String _Name, Object _parent, String _uriPath, String _Type, String _isLink, String _link, String _isSearch){
        Guid=UUID.randomUUID();
        Name=_Name;
        Parent=_parent;
        uriPath=_uriPath;
        Type=_Type;
        IsLink=_isLink;
        Link=_link;
        IsSearch=Boolean.valueOf(_isSearch);
    }

    public UUID getGuid() {
        return Guid;
    }

    public void setGuid(UUID guid) {
        Guid = guid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<String> getAttributes() {
        return Attributes;
    }

    public void addAttribute(String  attribute) {
        this.Attributes.add(attribute);
    }

    public int getAttributesCount() {
        return Attributes.size();
    }

    public ArrayList<Item> getChilds() {
        return Children;
    }

    public Object getChildren(int i) {
        return Children.get(i);
    }

    public void addChildren(Item children) {
        this.Children.add(children);
    }

    public int getChildCount() {
        return Children.size();
    }

    public Object getParent() {
        return Parent;
    }

    public void setParent(Object parent) {
        this.Parent = parent;
    }

    public String getUriPath() {
        return uriPath;
    }

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setAttributes(ArrayList<String> attributes) {
        Attributes = attributes;
    }

    public ArrayList<Item> getChildren() {
        return Children;
    }

    public void setChildren(ArrayList<Item> children) {
        Children = children;
    }

    public String getIsLink() {
        return IsLink;
    }

    public void setIsLink(String isLink) {
        IsLink = isLink;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public Boolean getIsSearch() {
        return IsSearch;
    }

    public void setIsSearch(Boolean search) {
        IsSearch = search;
    }
}
