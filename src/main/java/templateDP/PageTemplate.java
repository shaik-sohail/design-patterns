package templateDP;

abstract class PageTemplate {

    void  header(){
        System.out.println("iam the header of the page");
    }
    void footer(){
        System.out.println("iam the footer part");
    }
    public abstract void content();
    public final void draw(){
        header();
        content();
        footer();
    }

}
