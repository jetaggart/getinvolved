class StoriesController < ApplicationController
  def new
    @story = Story.new
  end

  def create
    Story.create!(new_story_params)
    redirect_to stories_path, :notice => "Story has been created"
  end

  def new_story_params
    params.require(:story).permit(:title, :description, :story_date)
  end

  def index
    @stories = Story.all
  end
end
