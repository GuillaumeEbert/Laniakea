package shindra.laniakea.UI.View3;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by Guillaume on 01/02/2018.
 */

public class View3Model extends ViewModel {



    // Create a LiveData with a String
    private MutableLiveData<String> filmTitle;
    private MutableLiveData<String> cast;
    private MutableLiveData<String> description;
    private MutableLiveData<String> filmBackdrop;

    public MutableLiveData<String> getFilmTitle() {
        if (filmTitle == null) {
            filmTitle = new MutableLiveData<String>();
        }
        return filmTitle;
    }


    public MutableLiveData<String> getCast() {
        if (cast == null) {
            cast = new MutableLiveData<String>();
        }
        return cast;
    }


    public MutableLiveData<String> getDescription() {
        if (description == null) {
            description = new MutableLiveData<String>();
        }
        return description;
    }



    public MutableLiveData<String> getFilmBackdrop() {
        if (filmBackdrop == null) {
            filmBackdrop = new MutableLiveData<String>();
        }
        return filmBackdrop;
    }




}
