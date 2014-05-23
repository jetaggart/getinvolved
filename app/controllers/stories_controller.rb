class StoriesController < ApplicationController
  def new
    @story = Story.new
  end

  def create
    @story = Story.create!(new_story_params)
    redirect_to @story, :notice => "Story has been created"
  end

  def new_story_params
    params.require(:story).permit(:title, :title, :story_date)
  end

  def index
    @stories = Story.all
  end

  def show
    @story = Story.find(params[:id])
  end
end
