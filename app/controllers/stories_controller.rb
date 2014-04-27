class StoriesController < ApplicationController
  def new
    @story = Story.new
  end

  def create
    Story.create!(new_story_params)
    redirect_to '/', :notice => "Story has been created"
  end

  def new_story_params
    params.require(:story).permit(:description)
  end
end
