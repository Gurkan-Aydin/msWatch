package com.example.ms_watch.manage;


import com.example.ms_watch.models.MoviesSeries;
import com.example.ms_watch.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class MSController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static List<MoviesSeries> moviesSeriesList;

    @RequestMapping(value = "/filterMS", method = RequestMethod.GET)
    public void getFilterMS(@ModelAttribute("ms_type") String msType, @ModelAttribute("producer") String producer,
                            @ModelAttribute("ms") String ms){
        moviesSeriesList = jdbcTemplate.query("select * from movies_series where producer_id = (select id from producer where producer_name = '"+ producer+"');"
                       ,
                new RowMapper<MoviesSeries>() {
                    @Override
                    public MoviesSeries mapRow(ResultSet rs, int rowNumber) throws SQLException {
                        MoviesSeries moviesSeries = new MoviesSeries();
                        moviesSeries.setId(rs.getInt("id"));
                        moviesSeries.setTitle(rs.getString("title"));
                        moviesSeries.setPoint(rs.getInt("point"));
                        moviesSeries.setCover(rs.getString("cover"));
                        moviesSeries.setProducerId(rs.getInt("producer_id"));
                        moviesSeries.setTime(rs.getInt("time"));
                        moviesSeries.setReleaseDate(rs.getString("release_date"));
                        moviesSeries.setIsSeries(rs.getString("is_series"));
                        return moviesSeries;
                    }
                });
        System.out.println("a");
    }
}
