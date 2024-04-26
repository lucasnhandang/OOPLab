package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    List<Media> mediae = new ArrayList<Media>();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.getId() + ". " + this.getTitle() + " - " + this.getCategory() + " - " + this.getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Media) {
            Media media = (Media) o;
            return Objects.equals(media.getTitle(), this.getTitle());
        }
        else {
            return false;
        }
    }
}
