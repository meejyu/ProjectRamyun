package com.jinju.Ramyun.recipe.service;

import com.jinju.Ramyun.recipe.dao.RecipeMapper;
import com.jinju.Ramyun.recipe.model.RecipeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeMapper recipeMapper;

    public RecipeService(RecipeMapper recipeMapper) {
        this.recipeMapper = recipeMapper;
    }

    public List<RecipeDTO> recipeList() {
        return recipeMapper.recipeList();
    }

//    public RecipeDTO recipeDTO(int id) {
//        return recipeMapper.recipeDTO(id);
//    }

    public int recipeCreate (RecipeDTO recipeDTO) {
        return recipeMapper.recipeCreate(recipeDTO);
    }

    public int recipeUpdate (RecipeDTO recipeDTO) {
        return recipeMapper.recipeUpdate(recipeDTO);
    }

    public int recipeDelete (int id) {
        return recipeMapper.recipeDelete(id);
    }

}
