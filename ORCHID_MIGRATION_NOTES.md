- Included files should be strings rather than raw text, and should have the base dir of `includes/`. The files 
    themselves should have an extension of `.peb` instead of `.html`. This extension should also be omitted from the 
    include tag.
    - Jekyll: `{% include footer.html %}`
    - Orchid: `{% include 'includes/footer' %}`
- Instead of using `site.posts`, `site.pages`, or `paginator` for getting lists of posts/pages, use the `findAll()` 
    function as described [here](https://orchid.run/wiki/user-manual/core-concepts/internal-links#find-all-function)
- Instead of manually applying the site base URL to every link, everything should use the `asset` and `baseUrl` filters
    or `page.link` to format links properly. Also, assets should include the base dir of `assets/`
    - links:
        - Jekyll: `<a href="{{ site.baseurl }}/tags/1">...</a>` 
        - Orchid: `<a href="{{ 'tags/1'|baseUrl }}">...</a>`
    - pages:
        - Jekyll: `<a href="{{ site.baseurl }}{{ page.url }}">...</a>` or `<a href="{{ page.url | prepend: site.baseurl }}">...</a>` 
        - Orchid: `<a href="{{ page.link }}">...</a>`
    - images:
        - Jekyll: `<img src="{{ site.baseurl}}/images/image_one.jpeg">` 
        - Orchid: `<img src="{{ 'assets/images/image_one.jpeg'|asset }}">` 
- Most Jekyll filters/functions probably won't work out-of-the-box. Follow the console errors to replace the Jekyll 
    filters with the Pebble equivalents listed [here](https://pebbletemplates.io/wiki/). Some may also be provided by 
    Orchid, and can be found in the Admin Panel
- Replace SimpleJekyllSearch with OrchidSearch plugin
- Use Template Inheritance instead of `layout: default` in a layout's front matter for the page/post layouts
