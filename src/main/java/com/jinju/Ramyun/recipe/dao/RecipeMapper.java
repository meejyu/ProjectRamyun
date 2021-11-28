package com.jinju.Ramyun.recipe.dao;

import com.jinju.Ramyun.recipe.model.RecipeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecipeMapper {

//    RecipeDTO recipeDTO(int id);

    List<RecipeDTO> recipeList();

    int recipeCreate (RecipeDTO recipeDTO);
    int recipeUpdate (RecipeDTO recipeDTO);
    int recipeDelete (int id);

}
