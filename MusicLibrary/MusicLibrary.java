
/**
 * Write a description of class MusicLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibrary
{
    private int albums=0;
    private Album [] library = new Album[20];
    private int size = 10;

    public MusicLibrary()
    {
        
    }

    public void doubleSize()
    {
        size=20;
    }
    public String toString()
    {
        String output="";
        for (int x=0; x<albums; x++)
        {
            output+=("Slot "+ (x+1) + ": " + library[x] + "\n");
        }
        for (int x=albums; x<size; x++)
        {
            output+=("Slot "+ (x+1) + ": Empty" + "\n");
        }
        return output;
    }
    public void add(Album ax)
    {
        if (albums<size)
        {
            library[albums]=ax;
            albums++;
        }
        else
        {
            System.out.println("Library Full. Current size is "+size);
        }
    }
    
    public void remove(int x)
    {
        Album [] tempLibrary=new Album[size];
        for (int y=x; y<size;y++)
        {
            tempLibrary[y-1]=library[y];
        }
        for (int y=0; y<size; y++)
        {
            library[y]=tempLibrary[y];
        }
        albums--;
    }
    public int tracks()
    {
        int tracks=0;
        for (int x=0;x<albums;x++)
        {
            tracks+=library[x].tracks;
        }
        return tracks;
    }
    public Album linearArtist(String artist)
    {
        for (int x=0;x<size;x++)
        {
            if (library[x].artist.equals(artist))
            {
                return library[x];
            }
        }  
        return null;
    }
    public Album linearTitle(String title)
    {
        for (int x=0;x<size;x++)
        {
            if (library[x].title.equals(title))
            {
                return library[x];
            }
        }  
        return null;
    }
    public void selectSortTitle()
    {
        int min;
        for (int i=0;i<size;i++)
        {
            min = i;
            for (int j=i;j<size;j++)
            {
                if (library[min].title.compareTo(library[j].title)>0)
                {
                    min=j;
                }
            }
            Album placeholder = library[i];
            library[i]=library[min];
            library[min]=placeholder;
        }
    }
    public void insertSortArtist()
    {
        for (int i=0;i<size;i++)
        {
            for (int position=i;position>0;position--)
            {
                if (library[position].artist.compareTo
                (library[position-1].artist)<0)
                {
                    Album placeholder=library[position-1];
                    library[position-1]=library[position];
                    library[position]=placeholder;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public int binarySearchArtist(String artist)
    {
        int low=0;
        int high=size;
        int index=-1;
        insertSortArtist();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (library[mid].artist.compareTo(artist)<0){
                low = mid + 1;
            } else if (library[mid].artist.compareTo(artist)>0) {
                high = mid - 1;
            } else if (library[mid].artist.equals(artist)) {
                index = mid;
                break;
            }
        }   
        return index;
    }
    
    
    public Album getAlbum(int index)
    {
        return library[index];
    }
}
