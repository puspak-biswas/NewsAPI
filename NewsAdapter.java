public class NewsAdapter extends ArrayAdapter<News>{

    private ArrayList<news> mNewsList;

    public NewsAdapter(Context context, ArrayList<News> newsList){
      super(context,0,newsList);
      mNewsList = newsList;
    }
    
    
    public View getView(Context context,View view, int position{
      if (view == null){
        view = inflate(R.id.list_item);
      }
      
      News news = mNewsList.getItem(position);
      
      
    }
}
