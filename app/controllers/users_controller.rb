class UsersController < ApplicationController
  def new
    @user = User.new
  end

  def create
    User.create!(new_user_params)
    redirect_to new_story_path
  end

  private

  def new_user_params
    params.require(:user).permit(:name, :email, :password, :password_confirmation)
  end
end
