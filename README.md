# Side-Menu
It's just a small library that allows you to add unlimited item's in the menu and allows you to customize your icon<br><br>
![gif](https://user-images.githubusercontent.com/63853553/105636779-91c7b880-5e72-11eb-824d-2e76d9a7a0a4.gif)
<h2><a id="user-content-how-to-use" class="anchor" aria-hidden="true" href="#how-to-use"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>How to use</h2>
<p>Option 1: Simply fork or download the project, you can also download and create <code>.aar</code> file yourself.</p>
<p>Option 2: Jitpack</p>
<p>Add Jitpack in your root build.gradle at the end of repositories:</p>
<div class="highlight highlight-source-groovy"><pre>allprojects {
    repositories {
        <span class="pl-k">..</span>.
        maven { url <span class="pl-s"><span class="pl-pds">"</span>https://jitpack.io<span class="pl-pds">"</span></span> }
    }
}</pre></div>

<p>Add to your dependencies:</p>
<div class="highlight highlight-source-groovy"><pre>dependencies {
    <span class="pl-s"><span class="pl-pds"></span>implementation 'com.github.Ibrahim-Mushtaha:Side-Menu:0.3'</span>
}</pre></div>

<h2><a id="user-content-notable-features" class="anchor" aria-hidden="true" href="#notable-features"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Notable features</h2>
<ul>
<li>Change icon resource</li>
<li>Change iconTint</li>
<li>Change selected icon size</li>
<li>Change selected icon tint</li>
<li>Change selected icon resource</li>
<li>Change background color</li>
<li>Change selected icon size</li>
</ul>

<h3><a id="user-content-instructions" class="anchor" aria-hidden="true" href="#instructions"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Instructions</h3>
<h4><a id="user-content-1-create-xml-layouts" class="anchor" aria-hidden="true" href="#1-create-xml-layouts"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>1. create XML layouts</h4>
<br>
<div class="highlight highlight-source-java"><pre><span class="pl-k">&lt;</span><span class="pl-k">?</span>xml version<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>1.0<span class="pl-pds">"</span></span> encoding<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>utf-8<span class="pl-pds">"</span></span><span class="pl-k">?</span><span class="pl-k">&gt;</span>
<span class="pl-k">&lt;</span><span class="pl-smi">androidx.constraintlayout.widget.ConstraintLayout</span> xmlns<span class="pl-k">:</span>android<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res/android<span class="pl-pds">"</span></span>
                android<span class="pl-k">:</span>layout_width<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
                android<span class="pl-k">:</span>layout_height<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
                android<span class="pl-k">:</span>background<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>@color/white<span class="pl-pds">"</span></span><span class="pl-k">&gt;</span>
  <span class="pl-k">
              &lt;</span><span class="pl-smi">com.ix.ibrahim7.sidemenulibrary.MenuView</span><br>                android<span class="pl-k">:</span>id<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>@+id/tv_menu<span class="pl-pds">"</span></span>
                android<span class="pl-k">:</span>layout_width<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                android<span class="pl-k">:</span>layout_height<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                android<span class="pl-k">:</span>padding<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>4px<span class="pl-pds">"</span></span><span class="pl-k">/</span><span class="pl-k">&gt;
                </span>

<span class="pl-k">&lt;</span><span class="pl-k">/</span><span class="pl-smi">androidx.constraintlayout.widget.ConstraintLayout</span><span class="pl-k">&gt;</span></pre></div>

<h4><a id="user-content-2-implement-a-view-renderer" class="anchor" aria-hidden="true" href="#2-implement-a-view-renderer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>2. Implement a Click Listener</h4>
<p>There is two way to implement the onClicklistener ⤵⤵</p>
<ul>
<li>
<div>
The first way 🔰🔰<br><br>
<pre><p> 
   // TODO THE SETCLICKITEMLISTENER RETURN THE ID
        menu1.setClickItemListener(object : MenuView.OnClickItemListener {
            override fun onClickItem(id: Int) {
                when (id) {
                    55 -> Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
                    44 -> Toast.makeText(this@MainActivity, "Category", Toast.LENGTH_SHORT).show()
                    33 -> Toast.makeText(this@MainActivity, "Cart", Toast.LENGTH_SHORT).show()
                }
            }
        })
</p></pre>
</div>
</li>
<li>
<div>
The second way 🔰🔰<br><br>
<p>You can implemecnt the OnClickItemListener Interface and use setCallback to active the listener</p>
<pre><p>

class MainActivity : AppCompatActivity() , MenuView.OnClickItemListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // TODO TO ACTIVE THE ON ACTIONLISTENER CLASS YOU MUST SET THE CALLBACK
        tv_menu.setCallback(this)

}

    override fun onClickItem(id: Int) {
        when (id) {
            55 -> Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
            44 -> Toast.makeText(this@MainActivity, "Category", Toast.LENGTH_SHORT).show()
            33 -> Toast.makeText(this@MainActivity, "Cart", Toast.LENGTH_SHORT).show()
        }
    }
}

</p></pre>
</div>
</li>
</ul>
<h4><a id="user-content-2-implement-a-view-renderer" class="anchor" aria-hidden="true" href="#2-implement-a-view-renderer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>3. AddItem</h4>
<pre><p> 
     tv_menu.apply {
            addItem(55, R.drawable.ic_baseline_home_black, true)
            addItem(44, R.drawable.ic_baseline_home_black, false)
            addItem(33, R.drawable.ic_baseline_home_black, false)
        }
</p></pre>

<h4><a id="user-content-2-implement-a-view-renderer" class="anchor" aria-hidden="true" href="#2-implement-a-view-renderer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>4. Change background color</h4>
<pre><p>
          tv_menu.setCardBackgroundColor(Color.parseColor("#181C23"))
</p></pre>


<h4><a id="user-content-2-implement-a-view-renderer" class="anchor" aria-hidden="true" href="#2-implement-a-view-renderer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>5. Change icon color</h4>
<pre><p>
          tv_menu.apply{
                 setIconTint(Color.BLUE)
                 setSelectedTint(Color.RED)
          }    
</p></pre>

<h4><a id="user-content-2-implement-a-view-renderer" class="anchor" aria-hidden="true" href="#2-implement-a-view-renderer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>6. Change selected icon resource</h4>
<pre><p>
          tv_menu.apply{
                  setSelectedImageResource(R.drawable.ic_launch))
          }
</p></pre>

<h4><a id="user-content-2-implement-a-view-renderer" class="anchor" aria-hidden="true" href="#2-implement-a-view-renderer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>7. Select a specific size for the selected icon</h4>
<pre><p>
          tv_menu.apply{
                  setSelectedImageSize(Height,width)
          }
</p></pre>

