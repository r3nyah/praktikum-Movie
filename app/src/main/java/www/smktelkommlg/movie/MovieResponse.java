package www.smktelkommlg.movie;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MovieResponse{
	private String response;
	private String totalResults;
	private List<SearchItem> search;


	public String getResponse(){
		return response;
	}

	public void setTotalResults(String totalResults){
		this.totalResults = totalResults;
	}

	public String getTotalResults(){
		return totalResults;
	}

	public void setSearch(List<SearchItem> search){
		this.search = search;
	}

	public List<SearchItem> getSearch(){
		return search;
	}
}