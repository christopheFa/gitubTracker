package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GithubersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Githuber githuber1 = new Githuber("githuber1","githuber1@github.com","login_githuber1","http://githuber.com/image/githuber1.gif");
        Githuber githuber2 = new Githuber("githuber2","githuber2@github.com","login_githuber2","http://githuber.com/image/githuber2.gif");
        Githuber githuber3 = new Githuber("githuber3","githuber3@github.com","login_githuber3","http://githuber.com/image/githuber3.gif");
        Githuber githuber4 = new Githuber("githuber4","githuber4@github.com","login_githuber4","http://githuber.com/image/githuber4.gif");
        Githuber githuber5 = new Githuber("githuber5","githuber5@github.com","login_githuber5","http://githuber.com/image/githuber5.gif");

        List<Githuber> listGithubers = new ArrayList();
        listGithubers.add(githuber1);
        listGithubers.add(githuber2);
        listGithubers.add(githuber3);
        listGithubers.add(githuber4);
        listGithubers.add(githuber5);

        req.setAttribute("listGithubers",listGithubers);

        req.getRequestDispatcher("/githubers.jsp").forward(req, resp);
    }
}
