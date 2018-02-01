package shindra.laniakea.RoomDb.Db;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import shindra.laniakea.MovieApi.DataUsable.Cast;

/**
 * Created by Guillaume on 31/01/2018.
 *
 */

public class RoomConverter {


    public static List<Integer> fromStringToInteger(String value) {
        Gson gson = new Gson();

        if (value == null) {
            return new ArrayList<>();
        }
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        return  gson.fromJson(value, listType);
    }


    public static String fromIntegerArrayList(List<Integer> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }




    public static List<Cast> fromStringToCast(String value) {
        Gson gson = new Gson();

        if (value == null) {
            return new ArrayList<>();
        }
        Type listType = new TypeToken<List<Integer>>() {}.getType();
        return  gson.fromJson(value, listType);
    }


    public static String fromCastArrayList(List<Cast> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }


}
