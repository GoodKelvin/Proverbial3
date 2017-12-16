package com.kelvingabe.kelvinoguno.proverbial.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Kelvin Oguno on 9/9/2017.
 */
@Dao
public interface ProverbsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addProverb(Proverbs proverb);

    @Query("select * from proverbs")
    public List<Proverbs> getAllProverbs();

    @Query("select * from proverbs where id = :id")
    public List<Proverbs> getProverb(long id);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateProverb(Proverbs proverb);

    @Query("delete from proverbs")
    void removeAllProverbs();
}
