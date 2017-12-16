package com.kelvingabe.kelvinoguno.proverbial.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by Kelvin Oguno on 9/9/2017.
 */
@Entity
public class Proverbs {
    @PrimaryKey
    public final long id;
    public String proverb_id;
    public String country_id;
    public String country_name;
    public String country_flag;
    public String category_id;
    public String category_name;
    public String proverb;

    public Proverbs(long id, String proverb_id, String country_id, String country_name, String country_flag, String category_id, String category_name, String proverb) {
        this.id = id;
        this.proverb_id = proverb_id;
        this.country_id = country_id;
        this.country_name = country_name;
        this.country_flag = country_flag;
        this.category_id = category_id;
        this.category_name = category_name;
        this.proverb = proverb;
    }

    public static ProverbsBuilder builder() {
        return new ProverbsBuilder();
    }

    public static class ProverbsBuilder {

        private long id;
        private String proverb_id = "";
        private String country_id = "";
        private String country_name = "";
        private String country_flag = "";
        private String category_id = "";
        private String category_name = "";
        private String proverb = "";

        public ProverbsBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public ProverbsBuilder setProverb_Id(String proverb_id) {
            this.proverb_id = proverb_id;
            return this;
        }

        public ProverbsBuilder setCountry_Id(String country_id) {
            this.country_id = country_id;
            return this;
        }

        public ProverbsBuilder setCountry_Name(String country_name) {
            this.country_name = country_name;
            return this;
        }

        public ProverbsBuilder setCountry_Flag(String country_flag) {
            this.country_flag = country_flag;
            return this;
        }

        public ProverbsBuilder setCategory_Id(String category_id) {
            this.category_id = category_id;
            return this;
        }

        public ProverbsBuilder setCategory_Name(String category_name) {
            this.category_name = category_name;
            return this;
        }

        public ProverbsBuilder setProverb(String proverb) {
            this.proverb = proverb;
            return this;
        }


        public Proverbs build() {
            return new Proverbs(id, proverb_id, country_id, country_name, country_flag, category_id, category_name, proverb);
        }


    }

    //@Override
    public String toptring() {
        return "Proverbs{" +
                "id=" + id +
                ", summary='" + proverb + '\'' +
                ", description='" + country_name + '\'' +
                ", done=" + proverb +
                '}';
    }
}
