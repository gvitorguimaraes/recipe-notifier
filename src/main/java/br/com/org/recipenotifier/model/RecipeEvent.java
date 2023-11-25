package br.com.org.recipenotifier.model;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Classe para representar o evento da receita recebido
 */

@Component
public class RecipeEvent {
	
	private Integer id;
	
	private Integer idRecipe;
	
	private Date eventReciveDate;
	
	private Boolean emailSent;
	
	//Recipes data
	
	private String recipeName;
	
	private String recipeDescription;

	
	
	public Integer getIdRecipe() 
	{
		return idRecipe;
	}

	public void setIdRecipe(Integer idRecipe) 
	{
		this.idRecipe = idRecipe;
	}

	public Date getEventReciveDate() 
	{
		return eventReciveDate;
	}

	public void setEventReciveDate(Date eventReciveDate) 
	{
		this.eventReciveDate = eventReciveDate;
	}

	public Boolean getEmailSent() 
	{
		return emailSent;
	}

	public void setEmailSent(Boolean emailSent) 
	{
		this.emailSent = emailSent;
	}

	public String getRecipeName() 
	{
		return recipeName;
	}

	public void setRecipeName(String recipeName) 
	{
		this.recipeName = recipeName;
	}

	public String getRecipeDescription() 
	{
		return recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) 
	{
		this.recipeDescription = recipeDescription;
	}

	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	// ================
	
	
	
}
