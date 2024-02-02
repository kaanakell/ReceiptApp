package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DbManager extends SQLiteOpenHelper {
    private static final String database_NAME = "IngredientsDB";
    public static final String table_name= "Ingredients_table";
    public static final String ingredients_NAME = "INGREDIENTS_NAME";
    public static final String ingredients_ID = "id";
    public static final String CREATE_INGREDIENTS_TABLE = "CREATE TABLE "
            + table_name+ " ("
            + ingredients_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ingredients_NAME+ " VARCHAR )";

    public static final String table2_name= "Recipe_table";
    public static final String recipe_NAME = "RECIPE_NAME";
    public static final String recipe_Description = "RECIPE_Description";
    public static final String recipe_Ingredients = "RECIPE_Ingredients";


    public static final String recipe_ID = "id1";
    public static final String CREATE_RECIPE_TABLE = "CREATE TABLE "+table2_name+ "("
            +  recipe_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+ recipe_NAME +" VARCHAR, "+ recipe_Description+ "   VARCHAR, Recipes_Image       BLOB, "+recipe_Ingredients+" VARCHAR, Ingredients_Id REFERENCES Ingredients (Id) )";


    public DbManager(Context context) {
        super(context, database_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_INGREDIENTS_TABLE);
        db.execSQL(CREATE_RECIPE_TABLE);




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+table_name);
        db.execSQL("DROP TABLE IF EXISTS "+table2_name);
        this.onCreate(db);

    }

    public void IngredientsEkle(String foodname){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ingredients_NAME,foodname);
        db.insert(table_name,null,cv);
        db.close();
    }
    public void RecipeAdd(String rName,String rDescritpion ,byte[] rImage,String rIngredients){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(recipe_NAME,rName);
        cv.put(recipe_Description,rDescritpion);
        cv.put("Recipes_Image",rImage);
        cv.put(recipe_Ingredients,rIngredients);
        db.insert(table2_name,null,cv);
        db.close();
    }
    public ArrayList<String> malzemeleriGetir(){
        ArrayList<String> malzemeler = new ArrayList<>();
        String query = "SELECT * FROM "+table_name;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()){
            do {
                Ingredients ingredients = new Ingredients();
                ingredients.setMalzeme(cursor.getString(1));
                malzemeler.add(ingredients.getMalzeme());
            } while (cursor.moveToNext());
        }
        return malzemeler;
    }

    public ArrayList<FoodData> BringRecipes(ArrayList<String> arrayList){
        String query="SELECT * FROM "+table2_name+" WHERE RECIPE_Ingredients LIKE '%"+arrayList.get(0)+"%'" ;
        SQLiteDatabase db=this.getReadableDatabase();

        ArrayList<FoodData> arr = new ArrayList<>();

        for(int i=1; i<arrayList.size();i++){
            query+=" OR RECIPE_Ingredients LIKE '%"+arrayList.get(i)+"%'";
        }
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()){
            do {
                FoodData fdata = new FoodData(cursor.getString(1),cursor.getString(2),cursor.getBlob(3),cursor.getString(4));
                arr.add(fdata);
            } while (cursor.moveToNext());
        }

        
        return arr;

    }


}

