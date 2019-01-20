package org.goodev.retrofitdemo.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Contacto implements Parcelable {
    private String user_id;
    private String created_at;
    private String birth_date;
    private String first_name;
    private String last_name;
    private List<Phone> phones;
    private String thumb;
    private String photo;

    public Contacto(){
    }



    protected Contacto(Parcel in) {
        user_id = in.readString();
        created_at = in.readString();
        birth_date = in.readString();
        first_name = in.readString();
        last_name = in.readString();
        phones = in.createTypedArrayList(Phone.CREATOR);
        thumb = in.readString();
        photo = in.readString();
    }

    public static final Creator<Contacto> CREATOR = new Creator<Contacto>() {
        @Override
        public Contacto createFromParcel(Parcel in) {
            return new Contacto(in);
        }

        @Override
        public Contacto[] newArray(int size) {
            return new Contacto[size];
        }
    };

    @Override
    public String toString() {
        return first_name + ", " + last_name;
    }

    public String getId() {
        return user_id;
    }

    public void setId(String id) {
        this.user_id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(user_id);
        dest.writeString(created_at);
        dest.writeString(birth_date);
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeTypedList(phones);
        dest.writeString(thumb);
        dest.writeString(photo);
    }
}
